# Git basic exercises

## 1- Initialize or clone a repository locally

### 1. Execute a command to initialize a repository on your computer: 

You have two possibilities here:  
   1- Init a repository locally  
```
$ git init
Initialized empty Git repository in C:/Users/trainer/workspaces/training/git_training/.git/
```
   By initializing a repository on your computer, at one moment you'll want to share your code.  
   To do so, you will need to push your code on a remote repository.  
   You will need to create it on the remote server (look at the documentation of the git server solution your 
   organisation is using) and configure it locally as follow:  
```
$ git remote add origin <PROTOCOL>://<REPOSITORY_URL>/training/git_training.git
```  
    
   2- Clone a remote repository
   ```
    $ git clone <PROTOCOL>://<REPOSITORY_URL>/training/git_training.git   
    Clonage dans 'git_training'...   
    remote: Enumerating objects: 1128, done.   
    remote: Counting objects: 100% (1128/1128), done.   
    remote: Compressing objects: 100% (466/466), done.   
    remote: Total 1128 (delta 235), reused 1107 (delta 228)   
    Object reception: 100% (1128/1128), 108.82 KiB | 619.00 KiB/s, done.   
    Deltas resoltuion: 100% (235/235), done.   
   ```

## 2 - Create your first commit  

### 1. Create a file (here it is firstname.txt with this content "Daniel") and execute git status: 
```
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   firstname.txt

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   firstname.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/
```

### 2. Add the firstname.txt file to the staging area and check the status: 
```
$ git add firstname.txt
```
```
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   firstname.txt

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   exercies.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/
```

### 3. Commit the firstname.txt : 
```
$ git commit -m "Adding firstname.txt file"
[master (root-commit) c06d90a] Adding firstname.txt file
2 files changed, 1 insertion(+)
create mode 100644 firstname.txt
create mode 100644 exercies.md
```

### 4. Check the log of your current branch: 
```
$ git log
commit c06d90ae1e5ac8a26cbb7cb349dcc0452f25caaa (HEAD -> master)
Author: Dan MAGIER (trainer) <dan@heiwa-it.com>
Date:   Thu Nov 28 11:38:44 2019 +0100

    Adding firstname.txt file
```

## 3- Make a change directly on the current branch

### 1. Modified the content of the file (here it will become "Dan") and commit it: 
```
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   firstname.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/

no changes added to commit (use "git add" and/or "git commit -a")
```
```
$ git add firstname.txt
```
```
$ git commit -m "Fix file content"
[master 7c8754a] Fix file content
1 file changed, 1 insertion(+), 1 deletion(-)
```
   We execute a git log command to see what has been commited to our repository:
```
$ git log
commit 7c8754abc5d31aa9acfac407185b1197e5755696
Author: Dan MAGIER (trainer) <dan@heiwa-it.com>
Date:   Thu Nov 28 11:48:26 2019 +0100

    Fix file content

commit c06d90ae1e5ac8a26cbb7cb349dcc0452f25caaa
Author: Dan MAGIER (trainer) <dan@heiwa-it.com>
Date:   Thu Nov 28 11:38:44 2019 +0100

    Adding firstname.txt file 
```  

## 4- Make a change by creating a new branch

### 1. Creating a new branch and list all the branch 
```
$ git checkout -b lastname_feature
  Switched to a new branch 'lastname_feature'
``` 
NB: `git checkout -b <branch_name>` is a shortcut for `git branch <branch_name>` followed by `git checkout <branch_name>` 

```
$ git branch -a
  master
* lastname_feature
```

### 2. Adding a new file lastname.txt to the lastname_feature branch and commiting it
```
$ git add lastname.txt
``` 
```
$ git commit -m "Adding lastname.txt file"
[lastname_feature 348177f] Adding lastname.txt file
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 lastname.txt
```

### 3. Merging the lastname_feature branch into the master branch 
First go to the master branch: 
```
$ git checkout master
``` 
After that, you can do one of this two commands:  
   1- We do a rebase:  
``` 
$ git rebase lastname_feature
First, rewinding head to replay your work on top of it...
Fast-forwarded master to lastname_feature. 
```

   2- We do a merge:  
```
$ git merge lastname_feature
Updating 7c8754a..348177f
Fast-forward --ff-only
lastname.txt | 0
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 lastname.txt  
```  
   3- We execute a git log command to see the result of the merge or rebase.  
      Here the result are identical but in some it won't.  
       
```
$ git log
commit 348177f601fab2affdba8936beb2e472eddbe6eb (HEAD -> master, lastname_feature)
Author: Dan MAGIER (trainer) <dan@heiwa-it.com>
Date:   Thu Nov 28 15:18:33 2019 +0100

    Adding lastname.txt file

commit 7c8754abc5d31aa9acfac407185b1197e5755696
Author: Dan MAGIER (trainer) <dan@heiwa-it.com>
Date:   Thu Nov 28 11:48:26 2019 +0100

    Fix file content

commit c06d90ae1e5ac8a26cbb7cb349dcc0452f25caaa
Author: Dan MAGIER (trainer) <dan@heiwa-it.com>
Date:   Thu Nov 28 11:38:44 2019 +0100

    Adding firstname.txt file 
```  

### 4. Delete the lastname_feature branch:  
    Be sure to be on another branch that the one you want to delete and execute the following command:  
```
$ git branch -d lastname_feature
Deleted branch lastname_feature (was 348177f).
```        
```  
$ git branch -a
  * master
```   

## 5- Pushing locally to our remote repository

### 1. Push our modification on the remote server:
You have two possibilities here:  
   1- If you have initiated locally your repository:
```
git push -u orgin master
```

   2- If you have clone a remote repository
```
git push
```

## 5- Resolving a conflict
Sometimes, two or more people are working simultaneously on a file locally.  
After that they want to share with others the result of their works.  
To do so, they have to push on the remote repository what they have done.  
For the first one, the result should be push easily with no conflicts.  
For the others, it won't be the same.  
GIT will detect that their local branch is behind the remote repository and will ask them to merge locally what has been 
pushed before they'll be able to push the result of their work.

For this exercise, one person will add his lastname to the lastanme.txt file and push it to the remote.
After that each person doing the exercise will add his lastname in lastanme.txt file, commit his change and push it to the remote.

Thge gaol here is to resolve a conflict. There are ways to avoid to do it but this is not the primary goal in our case.

1. Here you will try to add your lastname in the lastname.txt file. The content of your file should look like this:  
```
DOE
<your_lastanme_in_uppercase>
```

2. Commit your file and try to push it to the remote:  
```
$ git add lastname.txt
```
```
$ git commit -m "Adding KONG to lastname.txt"
[master 003618e] Adding KONG to lastname.txt
 1 file changed, 1 insertion(+)
```
```
$ git push
To ssh://<remote_server>/formations/firstname-lastname.git
 ! [rejected]        master -> master (fetch first)
error: impossible de pousser des références vers 'ssh://<remote_server>/formations/firstname-lastname.git'
astuce: Les mises à jour ont été rejetées car la branche distante contient du travail que
astuce: vous n'avez pas en local. Ceci est généralement causé par un autre dépôt poussé
astuce: vers la même référence. Vous pourriez intégrer d'abord les changements distants
astuce: (par exemple 'git pull ...') avant de pousser à nouveau.
astuce: Voir la 'Note à propos des avances rapides' dans 'git push --help' pour plus d'information.
```
You can see that the remote contains some works not present in your local repository.
So you need to merge it locally first.

3. Get the content of the remote locally:
```
$ git pull
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 1), reused 0 (delta 0)
Dépaquetage des objets: 100% (3/3), fait.
Depuis ssh://<remote_server>/formations/firstname-lastname
   ed74e54..b1395a3  master     -> origin/master
Fusion automatique de lastname.txt
CONFLIT (contenu) : Conflit de fusion dans lastname.txt
La fusion automatique a échoué ; réglez les conflits et validez le résultat.
```

There are some conflict to resolve.

4.  Resolve the conflicts
Here are the content of the lastname.txt file
```
MAGIER
<<<<<<< HEAD
KONG
=======
CHIRON
>>>>>>> b1395a34bbfb985416cd04d327566e5227bd72bb
```
Everything between the <<<<< HEAD and ===== are YOUR local changes. 
Everything between the ==== and >>>> b1395a34bbfb985416cd04d327566e5227bd72bb are the REMOTE's changes (e.g. your team mates).

To fix a merge conflict, simply edit the file until it looks the way you want it to. 
This means removing all the >>>, ===, and <<< markers, keep what you want to have in your file, and then save the file. 
This is a way to resolved your conflict, but you can do it differently with your IDE for example.

Here is the result we want to push:
```
MAGIER
KONG
CHIRON
```

5. Add the lastname.txt file to the staging area and commit your change
```
$ git add lastname.txt
$ git commit -m "merged lastnames"
[master c27a00a] merged lastnames
```

6. Push your changes to the remote repository
```
$ git push
Énumération des objets: 10, fait.
Décompte des objets: 100% (10/10), fait.
Compression par delta en utilisant jusqu'à 8 fils d'exécution
Compression des objets: 100% (4/4), fait.
Écriture des objets: 100% (6/6), 539 bytes | 539.00 KiB/s, fait.
Total 6 (delta 2), réutilisés 0 (delta 0)
To ssh://<remote_server>/formations/firstname-lastname.git
   b1395a3..c27a00a  master -> master
```

You have resolved a conflict and pushed your merge!
