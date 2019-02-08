@echo off
setlocal enabledelayedexpansion
set filename=Class$.java
set count=100
for /l %%A IN (6 1 150) DO (
 javac -d Compiled_150_classes "!filename:$=%%A!"
)
)

exit /b