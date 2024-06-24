# Contributing Guide

First, thanks for taking the time to contribute! ❤️

We want to make contributing to this project as easy and transparent as possible, whether it's:

- Reporting a bug
- Discussing the current state of the code
- Submitting a fix
- Proposing new features

## I have a question

If you want to ask a question, we assume that you've read the available documentation.

Before you ask a question, it is best to search for existing issues that might help you.  
In case you've found a suitable issue and still need clarification, you can write your question in this issue.

If you still feel the need to ask a question and need clarification, we recommend the following:

- [Open an Issue][open-issue].
- Provide as much context as you can about what you’re running into or what you're interested in.
- We will then take care of the issue as soon as possible.

## I want to contribute

> [!NOTE]
>
> In short, when you submit code changes, your submissions are understood to be under the same [MIT License][mit] that covers the project.  
> Feel free to contact the maintainers if that is a concern.

### Reporting bugs

We use GitHub issues to track public bugs.
Report a bug by [opening a new issue][open-issue].

Great Bug Reports tend to have:

- A quick summary and background
- Steps to reproduce
  - Be specific!
  - Give a sample code if you can.
  - Provide information about the environment (versions of AGP, Kotlin, and so on), depending on what seems relevant
- What you expected would happen
- What actually happens
- Notes (possibly including why you think this might be happening, or what you've already tried to fix it)

### Suggesting changes

We use [GitHub Flow][github-flow], so all code changes are done via pull requests.

The Pull Request flow is as follows:

1. Create an issue to coordinate changes with maintainers, or announce in an existing issue that you took the task to work.  
2. Fork the repository.
3. Create a new [branch](#branches).
4. [Commit](#commits) changes.  

5. When the pull request is ready, assign it to one of the maintainers.  
   > Make sure that all CI checks have been successfully passed
6. Then follow the standard scheme: review :arrow_right: changes with review :arrow_right: approve :arrow_right: merge :white_check_mark:.  
   > Merge the PR via rebase and remember to delete the branch.

## Naming

Naming conventions are created based on the opinions of the internal team, and we're open to suggestions!

## Branches

The branch name is generated using the `$type/$issue-$desc` pattern, where:

- `type` - type of change:
  - `feature` - new functionality
  - `fix` - changes to existing functionality
- `issue` - issue number (may not exist, but it is better to create an issue for any changes).
- `desc` - brief description. In two or three words about the functionality being developed.

## Commits

Name of commits according to the `$issue: $description` or `$type: $description` pattern, where:

- `$issue` - number of the issue to which the changes apply (may not exist)
- `$type` - added for changes not explicitly related to the issue.  
    The following types are agreed upon:
  - `fix` - bugfix
  - `feature` - new functionality
  - `review` - changes based on review results
  - `refactor` - refactoring
  - `docs` - changes in project documentation, adding comments with code documentation
- `$description` - brief description of changes made  
&nbsp;  

<!-- Links -->
[open-issue]: https://Github.com/RedMadRobot/%Stub%/issues/new
[mit]: https://choosealicense.com/licenses/mit/
[github-flow]: https://docs.github.com/en/get-started/using-github/github-flow
