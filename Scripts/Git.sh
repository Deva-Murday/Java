#!/bin/bash


# Add a file
if [ $1 = '-a' ];then
	git add $2
	git status
	echo -e '\e[0;35m' " !!! Don't forget to commit !!!"
fi
# Add a commit (m)
if [ $1 = '-c' ] && [ $2 = '-i' ];then
	echo "Type the message ?"
	read msg
	git commit -m "$msg"
fi
# Add a commit (am)
if [ $1 = '-c' ] && [ $2 = '-a' ];then
	echo "Type the message ?"
	read msg
	git commit -am $msg
fi

# Recap
if [ $1 = '-recap' ];then
	git status
	sleep 15
	echo -e '\e[0;32m' " ----- Here is the last commit -----"
	git log | head -n 6
fi

# Delete .class files
if [ $1 = "-del" ]; then
        rm main/*.class
        rm test/*.class
fi

# Create a new branch
if [ $1 = '-b' ] && [ $2 = '-c' ]; then
        git branch $3
		git branch
fi

# Delete a branch
if [ $1 = '-b' ] && [ $2 = '-s' ]; then	
        git checkout $4
		git branch -D $3
		git branch
fi
