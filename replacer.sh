#!/bin/sh
PATH_PARAM="/your_path/"

MODELNAME='creature'
MODELNAME_B='Creature'

HOST='127.0.0.1'

NC='\033[0m'

echo ""
echo "Start replacing: \033[31m{{MODELNAME}}${NC} with \033[31m${MODELNAME}${NC} in .java files"
eval "perl -pi -w -e 's/{{MODELNAME}}/${MODELNAME}/g;' ${PATH_PARAM}*.java"
eval "perl -pi -w -e 's/{{MODELNAME_B}}/${MODELNAME_B}/g;' ${PATH_PARAM}*.java"

echo "Start replacing: \033[31m{{MODELNAME}}${NC} with \033[31m${MODELNAME}${NC} in API_blueprint.md"
eval "perl -pi -w -e 's/{{MODELNAME}}/${MODELNAME}/g;' ${PATH_PARAM}API_blueprint.java"
eval "perl -pi -w -e 's/{{MODELNAME_B}}/${MODELNAME_B}/g;' ${PATH_PARAM}API_blueprint.java"

echo "Start replacing: \033[31m{{HOST}}${NC} with \033[31m${HOST}${NC} in API_blueprint.md"
eval "perl -pi -w -e 's/{{HOST}}/${HOST}/g;' ${PATH_PARAM}API_blueprint.md"
echo ""


