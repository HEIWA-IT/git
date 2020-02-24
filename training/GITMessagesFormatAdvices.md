# Formatting commit messages

## Why doing well formalize commit messages
Writing good commit messages should allow other team members to pre-understand clearly what has been 
developed in the commits.
It allows too to generate a changelog based on the commits message.
  
The cleaner the code we write, the easier it will be to them to understand the intention behind it.  
It is the same for a commit message.

To do it, it is recommended to decomposed your commit message in four different parts.

### 1 - The summary or subject line [MANDATORY FIELD] 
This field is _*mandatory*_.  
It should have the following format: [Type_of_commit][Jira_IDs] Short_description

The type_of_commit part could have the following values and is mandatory:
- FE for FEature
- FI for FIx
- HF for HotFix
 
Each Jira ticket involve in the commit will be listed between the two brackets of the Jira_IDs part.  
For example [JIRA-123, JIRA-321]  
If no Jira tickets are attached to this development, this part is not mandatory, else it is.  

The short_description part summarizes the changes made in a commit.  
**This part is MANDATORY!!!**
The subject line is here to convey the entire idea when possible.

example:  
```[FE][JIRA-456] Improving the commands use in the gitflow branch management```

### 2 - A "WHY" paragraph [RECOMMANDED FIELD]
This paragraph is here to make the others developers to understand the reasoning behind a change.
This is the **WHY**. It's always important to understand why something has been done.

`example:  
```
[FE][JIRA-456] Improving the commands use in the gitflow branch management

Because:
- the second rebase operation was misleading. Merge is more explicit in this case
- explicitly tell to do a merge --ff-only is better to align our history without sided commit
- it avoid commit messages like "merge ...." 
```

### 3 - A "WHAT" paragraph [RECOMMANDED FIELD]
This paragraph contains **WHAT** has been done.
It is a more detailled explanation of what has been done.

`example:  
```
[FE][JIRA-456] Improving the commands use in the gitflow branch management

Because:
- the second rebase operation was misleading. Merge is more explicit in this case
- explicitly tell to do a merge --ff-only is better to align our history without sided commit
- it avoid commit messages like "merge ...." 

When we have to put the commit of a feature, hotfix or fix branch into the develop or master branch,
I used a rebase.  
But this verb is misleading. I prefer to use merge with the ff-only option to be sure to have a 
fast-forward.
```

### 4 - The other sections: Additional notes and co-authors [RECOMMANDED FIELD]
In this part we can include additional notes, the co-authors and relevant links to this commit.

`example:  
```
[FE][JIRA-456] Improving the commands use in the gitflow branch management

Because:
- the second rebase operation was misleading. Merge is more explicit in this case
- explicitly tell to do a merge --ff-only is better to align our history without sided commit
- it avoid commit messages like "merge ...."

When we have to put the commit of a feature, hotfix or fix branch into the develop or master branch,
I used a rebase.  
But this verb is misleading. I prefer to use merge with the ff-only option to be sure to have a 
fast-forward.

These changes represent the demand in he JIRA ticket JIRA-456.
Co-authored-by: John DOE <john.doe@gmail.com>
```

## Benefits
If you follow the format we recommanded, anyone who looks at your commit message will be going to know:
1. What was done at a glance
2. Why you had to do it
3. What was done
4. Additional details concerning your commit

The commit message become more useful to any developers who need to understand the code.