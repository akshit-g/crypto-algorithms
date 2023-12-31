# Cryptography Algorithms

This repository contains implementations of various encryption algorithms in different programming languages. The algorithms included are:

- RSA
- SHA
- DES
- SSH
- AES
- Caesar

## RSA

RSA is a widely used asymmetric encryption algorithm. It utilizes the properties of large prime numbers to encrypt and decrypt messages securely. The implementation can be found in the `RSA` directory.

## SHA

SHA (Secure Hash Algorithm) is a family of cryptographic hash functions that are commonly used for data integrity checks and password hashing. The implementation can be found in the `SHA` directory.

## DES

DES (Data Encryption Standard) is a symmetric encryption algorithm that uses a 56-bit key to encrypt and decrypt data. It was widely used but has been replaced by more secure algorithms. The implementation can be found in the `DES` directory.

## SSH

SSH (Secure Shell) is a network protocol that allows secure remote login and data transfer over an unsecured network. It incorporates various encryption algorithms for secure communication. The implementation can be found in the `SSH` directory.

## AES

AES (Advanced Encryption Standard) is a symmetric encryption algorithm that is widely used for secure communication and data protection. It supports key sizes of 128, 192, and 256 bits. The implementation can be found in the `AES` directory.

## Caesar

The Caesar cipher is one of the simplest and oldest encryption techniques. It involves shifting the letters of the alphabet by a fixed number of positions. The implementation can be found in the `Caesar` directory.

Each directory contains code examples and instructions on how to use the respective encryption algorithm in the supported programming languages.

## Contributing

Contributions to this repository are welcome. If you have an implementation of an encryption algorithm in a programming language that is not included, feel free to submit a pull request.


### How to contribute?
#### Forking the repo
The first thing you need to do to be able to contribute to this repo, is to fork this repo. To do this, navigate to the top right of your screen to where it says `fork` and hit the button.

This will prompt you to create a forked repo that is owned by you and not by any one else.

#### Updating forked repo
Updating the forked repo is just like updating any other repo on GitHub using Git.

- First clone the repo by copying its link and using the CLI.
    - To copy its link, navigate to the home page of your repo *(Where its README file is displayed)* and find the `Code` button. Click the button and copy the first link you see.
    - Navigate to your Git bash and type in:
    `git clone <the_link_you_copied>`
    - Once the repo is cloned, a copy of the entire repo will be located as a folder on your computer in the same directory in which the bash was open.

- Once you've added files into that folder, you need the changes made on your computer to reflect in the repo on GitHub. To do this, execute the following commands:

    1. `git add .`
        - `git add` adds files to the tracked list to be committed and then pushed, and the argument it takes is `.` which adds all the currently untracked files into your staging area.
    2. `git commit -m "<your_commit_message_here>"`
        - `git commit` adds those files in the staging area as 'files to be committed' to the repo. The argument it takes is `-m` - which stands for message - and then the message that gives another collaborator information on what the files committed do.
        - Its important to note that you cannot commit without a message. Its just best practice to give meaningful messages in your commits.
    3. `git push`
        - This pushes all the files which were tracked as committed files in the previous step and is the final step to push your files to GitHub for the world (or collaborators to see).

- After you're satisfied with all the changes you've made to your forked repo, you then need to update the main repo from which you forked your repo.
    - You do this by creating a pull request (PR for short).
    - To do this, navigate to the GitHub page of the main repo and select the pull requests tab.
    - Then create a new pull request and enter a meaningful message like we did for commits.
    - After that, just sit tight and wait for a moderator or the repo owner to accept your PR and merge your code with the main repos or a comment from the mod/owner explaining why they didn't approve your PR.

#### Syncing your forked repo
###### Its important to note that before you start working on your forked repo, you want to make sure that your forked repo is up-to-date and is in sync with the main repo.
This is so that you don't step on any toes when you make your changes or you don't make changes and make a PR to find that someone beat you to the punch. You do this by executing the following commands in your Git bash.

###### Pre-requisite step
- `git remote add upstream <parent_github_repo_link>`
    - You get the parent link the same way you got your forked repo link when you cloned it, except you do it on the main/parent repos site.
    - This step is only a one time thing to make sure that you sync your repo w.r.t to the desired repo.

###### Steps
1. `git fetch upstream`
2. `git merge upstream/main` or `git merge upstream/master`
