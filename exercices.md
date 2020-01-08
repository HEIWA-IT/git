1. Execute a command to initialize a repository on your computer: 
```
$ git init
Initialized empty Git repository in C:/Users/420753/workspaces/RISE/git_training/.git/
```

2. Create a file (here it is example.txt with this content "this is example") and execute git status: 
```
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   example.txt

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   example.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/
```

3. Add the example.txt file to the staging area and check the status: 
```
$ git add example.txt
```
```
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   example.txt

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   exercies.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/
```

4. Commit the example.txt : 
```
$ git commit -m "Adding example.txt file"
[master (root-commit) c06d90a] Adding example.txt file
2 files changed, 1 insertion(+)
create mode 100644 example.txt
create mode 100644 exercies.md
```

5. Check the log of your current branch: 
```
$ git log
commit c06d90ae1e5ac8a26cbb7cb349dcc0452f25caaa (HEAD -> master)
Author: Dan MAGIER (420753) <dan.magier@externe.bnpparibas.com>
Date:   Thu Nov 28 11:38:44 2019 +0100

    Adding example.txt file
```

6. Modified the content of the file (here it will become "this is an example") and commit it: 
```
$ git status
On branch master
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        modified:   example.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .idea/

no changes added to commit (use "git add" and/or "git commit -a")
```
```
$ git add example.txt
```
```
$ git commit -m "Fix file content"
[master 7c8754a] Fix file content
1 file changed, 1 insertion(+), 1 deletion(-)
```

7. Creating a new branch and list all the branch 
```
$ git checkout -b new_feature
  Switched to a new branch 'new_feature'
```  
NB: `git checkout -b <branch_name>` is a shortcut for `git branch <branch_name>` followed by `git checkout <branch_name>` 

```
$ git branch -a
  master
* new_feature
```

8. Adding a new file newFeatureFile.txt to the new_feature branch and commiting it  
```
$ git add newFeatureFile.txt
``` 
```
$ git commit -m "Adding newFeatureFile.txt file"
[new_feature 348177f] Adding newFeatureFile.txt file
1 file changed, 0 insertions(+), 0 deletions(-)
create mode 100644 newFeatureFile.txt
```

9. Merging the new_feature branch into the master branch  
First go to the master branch:   
```
$ git checkout master
``` 
After that, you can do one of this two commands:   
    1. We do a rebase   
    ```
    $ git rebase new_feature
    First, rewinding head to replay your work on top of it...
    Fast-forwarded master to new_feature.
     ```   
    2. We do a merge   
     ```
     $ git merge new_feature
       Updating 7c8754a..348177f
       Fast-forward
        newFeatureFile.txt | 0
        1 file changed, 0 insertions(+), 0 deletions(-)
        create mode 100644 newFeatureFile.txt
     ```  
    3. We execute a git log command to see the result of the merge or rebase.   
       Here the result are identical but in some it won't.  
    
      ```
    $ git log
    commit 348177f601fab2affdba8936beb2e472eddbe6eb (HEAD -> master, new_feature)
    Author: Dan MAGIER (420753) <dan.magier@externe.bnpparibas.com>
    Date:   Thu Nov 28 15:18:33 2019 +0100
   
        Adding newFeatureFile.txt file
   
    commit 7c8754abc5d31aa9acfac407185b1197e5755696
    Author: Dan MAGIER (420753) <dan.magier@externe.bnpparibas.com>
    Date:   Thu Nov 28 11:48:26 2019 +0100
   
        Fix file content
   
    commit c06d90ae1e5ac8a26cbb7cb349dcc0452f25caaa
    Author: Dan MAGIER (420753) <dan.magier@externe.bnpparibas.com>
    Date:   Thu Nov 28 11:38:44 2019 +0100
   
        Adding example.txt file
       
      ``` 
10. Delete the new_feature branch:  
Be sure to be on another branch that the one you want to delete and execute the following command:  
```
$ git branch -d new_feature
Deleted branch new_feature (was 348177f).
``` 
```
$ git branch -a
  * master
```      