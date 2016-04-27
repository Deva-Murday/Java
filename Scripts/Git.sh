#!/bin/bash


# Ajouter un fichier
if [ $1 = '-a' ];then
	git add $2
	git status
	echo -e '\e[1;33m' " !!! N'oublie pas de commiter !!!"
fi


# Recap
if [ $1 = '-recap' ];then
	echo "${0}"
	echo "${1:10}"
	git status
	sleep 15
	git log
fi

# Supprimer les fichiers .class
if [ $1 = "-r" ]; then
        rm main/*.class
        rm test/*.class
fi

# Créer une branche
if [ $1 = '-b' ] && [ $2 = '-c' ]; then
        git branch $3
		git branch
fi

# Supprimer une branche
if [ $1 = '-b' ] && [ $2 = '-s' ]; then	
        git checkout $4
		git branch -D $3
		git branch
fi
