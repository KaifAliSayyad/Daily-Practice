Date  :08-02-2025

-------------------------------------------------------------------------------------------------------------
SDE LIFECYCLE
1. Planning
2. Coding
3. Build
4. Testing
5. Release
6. Deployment
7. Maintainance
8. Monitoring


-------------------------------------------------------------------------------------------------------------
DEVOPS PHASES
1. Plan
2. Code
3. Build
4. Test
5. Release
6. Deploy
7. Operate
8. Monitor


-------------------------------------------------------------------------------------------------------------
SDLC Models
1. Waterfall
2. Spiral
3. V-model
4. Agile

-------------------------------------------------------------------------------------------------------------

FSD (FE & BE)
FSE (FE & BE & DevOps)

-------------------------------------------------------------------------------------------------------------
Q. What is a DevOps Tool ?
-> Any tool which is helping us to improve lifecycle of a project is called as DevOps tool.

-------------------------------------------------------------------------------------------------------------
AGLIE Methodology
* Ways to implement Agile
1. Kanban
2. SCRUM
3. XP (Extreme Programming)
...etcs	

* SCRUM Meeting (Weekly)
* Standup Meeting (Daily)

* Roles invloved in SCRUM meeting
1. SCRUM Master
2. Product Owner
3. Stakeholder

-------------------------------------------------------------------------------------------------------------
DEVOPS Tools (Phase wise)
1. Plan		- JIRA 
2. Code		- IDE (Ecplipse, VSC, STS, Intellij), Git, Github
3. Build	- ANT, Maven, Gradle, etc..
4. Test		- JUint, Mockito, Selenium, Jest, Jasmine, Karma, etc...
5. Release	- Jenkins, CI/CD, TeamCity, etc...
6. Deploy	- Docker, Containerd, etc...
7. Operate	- Kubernetes, Ansible, etc...
8. Monitor	- Grafana, Splunk, etc...

-------------------------------------------------------------------------------------------------------------
Git (Global Information Tracker)
1. Git comes under SCM (Source Code Management) category.
2. More softwares like Git are - Perforce, Rational Clear Case.
3. What is SCM software?
	i. It should be able to track the changes.
	ii. It should be able to keep history.
	iii. Identify who has made changes.
	iv. Helps in collaboration.
4. What is difference between Git and Github?
-> GIT						GITHUB
i. Client side tool				Server side tool
ii. Git is command line tool			UI implementation of Git

5. Git cannot track the changes in a file unless it's added (git add <filename>)
6. To see the changes done in a file we can use 'git diff' and 'git show'
7. We have 3 parts -
	i. Working area - It is taken care by OS. Git is not involved at all.
	ii. Staging area - We need to stage file using 'git add <filename>'. Now the changes can be tracked.
	iii. Local Repo - Now the changes will be saved to local repository.

8. 'git rm --cache <filename>' is used to move file back from Staging area to Working area.
9.  'git status' to see files added/ modified.
10. 'git commit' to move file from staging area to local repo.
11. 'git show <commit_id>' is used to see insertion, modications and deletion in a file.
12. 'git log' to see history of commits.
13. To see changes between two commits to a file use 'git diff <commit_id_1> <commit_id_2>'
14. To see the branches present use 'git branch' or 'git branch <new_branch_name>'
15. To switch to a branch use 'git checkout <branch_name>'
16. (IMP) To merge the changes done in a branch into another branch use we go to the branch in which we want to merge our branch (main) then use 'git merge <branch_name>'. So the "branch_name" content are added to the current branch.
17. To delete a branch we need to first switch to another branch and then use 'git branch -d <branch_name>'
18. While creating a new branch the contents of the current branch (not main) are copied to the new branch.
19. We can also tag a commit with version using 'git tag v1.0' or 'git tag <commit_id> v1.0'
20 We can use 'git tag' to see all the tags which you've added.
21. We can use 'git tag -d v1.0' to delete a tag.
