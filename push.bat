@echo off
setlocal enabledelayedexpansion
cd /d "%~dp0"
for /f "delims=" %%i in ('git rev-parse --abbrev-ref HEAD 2^>NUL') do set BRANCH=%%i
if "%BRANCH%"=="" set BRANCH=main
git add -A
set CHANGES=
for /f "delims=" %%i in ('git status --porcelain') do set CHANGES=1
if not defined CHANGES (
  echo No changes. Skipping push.
  pause
  goto :eof
)
for /f "tokens=1-3 delims=/ " %%a in ("%date%") do set D=%%a-%%b-%%c
set T=%time::=-%
set MSG=auto: %D%_%T% update
git commit -m "%MSG%" || echo No staged changes
git push origin %BRANCH%
echo.
echo Done -> %BRANCH%
pause
