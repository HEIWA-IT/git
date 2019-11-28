#GIT CHEATS SHEET

## Configuration {#Configuration}

1. Define the user name associate to all commit operations  
`$ git config --global user.name "[name]"`

2. Define the user email associate to all commit operations  
`$ git config --global user.email "[email]"`

3. Activate the colorisation in the command line output  
`$ git config --global color.ui auto`

4. Each previous operation can be done specifically for each of your local repository.  
It allows you to have different user name, mail or other configurations per local repository.  
To do so just remove the "--global" argument.  
`$ git config user.name "[name]"`  
`$ git config user.email "[mail]"`   
`$ git config color.ui auto`  

5. List all of the user option
`$ git config --list`  

## Starting a repository {#starting_repository}

1. Init a local repository  
To do so, execute the following command in the folder you want to be a repository  
`$ git init`  

2. Cloning a remote repository  
`$ git clone [remote_repository_url]`

## Staging files {#staging_files}
1. Add all the files modified in your worksapce in the staging area  
`$ git add .` 

2. Add all the files given in parameter in the staging area  
`$ git add [file1] [file2] [file3]` 

3. Remove all the files given in parameter of the staging area  
`$ git rm --cached [file1] [file2] [file3]`  

3. Remove all the modified files from the staging area  
`$ git reset`  

## Status {#status}
One of the most important command. It shows you in which state is your repository.  
You can see all the modified files and its state  
`$ git status`

## Commiting {#commiting}
1. Command to commit the files of the staging area with a message  
`git commit -m "[message]"`  

2. Command to change the message of the last commit by a new one  
`it commit --amend -m "[new_message]"`  

## Pushing and pulling {#push_and_pull}
1. Fetching the changes in the branches and tags from the remote repository but not showing it in the workspace  
`git fetch`  

2. Pulling the commits that are not present in your actual branch and make it visible in your workspace.  
Actually a pull is a *fetch* + a *merge*  
`git pull`  

3. Pushing all the commits of the current branch that aren't pushed in the <branch_name> of the remote repository  
`git push -u [remote_repositroy_name] [branch_name]`  

## Branching {#branching}
1. List all the branches of your local repository  
`git branch --list` 

2. List all the branches of your local and remote repositories  
`git branch -a` 

3. Position your workspace in the branch <branch_name>.  
If <branch_name> is not found but there does exist a tracking branch in exactly one remote, it will track the remote branch  
`git checkout [branch_name]`  

4. Create a new branch based on the actual commit of the current one even without tracking a branch even if a remote one 
exists and shares the same name.  
`git checkout -b [branch_name]`  

## Tag {#tag}
1. List all the tags  
`git tag` 
2. Create a tag with <tag_name>  
`git tag [tag_name]`
3. Postion your workspace on the tag  
`git checkout [tag_name]`
 


## Merge {#merge}


## Rebase {#rebase}











