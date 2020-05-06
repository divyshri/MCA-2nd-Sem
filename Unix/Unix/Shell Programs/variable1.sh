#! /bin/bash
global="pretty good variable"
foo () {
local inside="not so good variable"
echo $global
echo $inside
global="better variable"
global=" ha han ha pretty good variable"
}
echo $global
foo
echo $global
echo $inside
