# Introduction

<b>S</b>oftware or <b>S</b>ystem <b>D</b>evelopment <b>L</b>ife <b>C</b>ycle describes cycles in Software development.
This article helps you to understand each life cycle, and explains the tools and integrations.

With these tools you can get valuable feedback that will improve the quality and the speed of releasing your product.
Once introduced the cycles, the tools are paired for these cycles, emphasizing why it is needed, how they contribute.

During reading this article you will know why a central software, or solution to manage your project is needed.
The benefit is that you can observe, analyze, and create reports of your whole system.
This also helps you create measurable goals (like KPI-s).

A great solution is https://www.treno.io/, what helps you to achieve this.

# SDLC Overview using Agile

To understand why the tools exists and what information they provide, you need to know the SDLC components and,
how they contribute to your product from scratch to go-live.

Understanding the contribution you will know what to expect from these life cycles, and how you can measure them.
Once you can <b>measure</b> the output, you will know where to improve. The how is up to you to define,
but a good central / orchestrator tool should be able to help you.
This is crucial since without an objective measurement you won't know that you actually improved.

Each of the following phases can be executed only once, like an old-fashioned waterfall model, or several times in an
Agile way.
The true power lies with the constant feedback after each cycle.
One cycle is building on the output from another, and even the iterations (all cycles combined once) are building on
each other.
A good tool helps you collect this information in a central place.

## Planning

For this phase project managers, stakeholders, tech leads, architects work together to create the project timeline, or
roadmap.
Stakeholders make sure that the functionalities are planned, tech leads make sure to give a t-shirt size estimation,
and project managers make sure to have team members ready.
Architects suggest an estimated infrastructure cost based on the requirements

At the end of the planning phase you need to be able to answer the big three questions.

* What is the <b>scope</b>? This can be answered by the roadmap.
* How much <b>time</b> will it take? The timeline should define this.
* What is the <b>cost</b>? This should be answered by the required team members, and infrastructure cost.

In Agile usually there are smaller increments of planning, but every project must have a big planning to be able
to answer the above three important questions.

## Requirements

Requirements are gathered during the Planning. Usually the initial planning sessions are not a few hours long.
They took days, or even a week.

Once the scope is more clear with agile, the requirements can be refined, or even changed.
These smaller sessions can happen during iterations in the form of planning, grooming, or refinement.

During the planning requirements are saved, into features, epics, and stories.
A good tool must help you to visualize a timeline from the features.

## Design

Designing can include the mockups, prototypes, architecture diagram, user interfaces as end result.

* Some designs are strict, like the look and feel of the application.
* Some can be flexible during development, either with agile, or any iterative way.
* Some are in an early state, like the user interfaces, which can be easily changed during development.

## Development

Development can be done by a few developers, or multiple teams.
Development is not just coding, it includes setting up environments, configuring the application, planning, thinking,
measuring,
writing unit test, and integration tests.
The end result of this phase is that you will have a versioned codebase.

With an agile approach the lines between Development, Testing, Deployment cycles, are almost invisible.
It blends inside the work of an iterative approach.

## Testing

Once a feature is ready it needs to be tested according to functional and non-functional requirements.

In Agile testing happens after a development is completed, and before releases, for example in the form of User
Acceptance Testing.

The end result of this cycle is a documentation of the test cases executed, with steps defining how to do the test.
Testing also includes reusable automated tests and the introduction of Quality Gates, like Sonarqube.

## Deployment

When your application is ready you need to deploy it. With Modern Agile practices
deployment can happen in a non-production environment automatically.

The end result of this cycle is that your application (prod or non-prod environment) is deployed, and ready to be used.

The minimum of the SDLC is to have an integrated CI/CD tool with none, or very minimum user interaction.

## Operations + Monitoring

This phase includes incident management, measuring your application, creating alerts, making sure that your application
can be used by your users, and that you can interfere and fix issues as fast as possible.
There are several tools that can manage that for you, so let's check the tools-

# Tools

The output of each cycle needs to be captured, measured and analyzed.
This is important to see that the big three in software development (scope, time, cost), are still on-track.
Even if you are on track you can be better and better if you have the right information.
The tools to help you achieve this, can be categorized as following.

* Design software
* Task management software
* Version control software
* <b>C</b>ontinuous <b>I</b>ntegration / <b>C</b>ontinuous <b>D</b>elivery software
* Monitoring software
* Collaboration software

## Design software

You won't find a solution that incubates these softwares.
The reason for this is that these design software creates a non-measurable result.
Does it matter that you have one screen or three? If you have less screen, is your application better, or more complex?

Figma or Adobe XD are design softwares that can help you to create mock-ups and prototypes.
An interesting concept is how you version these designs. With the constant iterative development and refinements,
designs can also change.

You need to make sure to track these changes, as they are mostly used in the <b>Design phase</b> of SDLC.

## Task management software

Jira is one of the most common Task Management software out there.
Treno supports the integration of Jira and Shortcut.

A task managements software is used in during <b>Planning, Development, Testing</b>
This software is key for Product owners, engineering managers and stakeholders.

A good software should help them keep track of cost, time, scope of the project.
Jira is powerful since by itself it contains all information in raw format what is needed to measure scope, time, and
cost,
and this is the feedback what you are looking for.

The problem with such a huge tool, that it requires expertise to understand, and to time to create the metrics, roadmaps
what you need.
Treno helps by collecting this raw data information.

## Version control software

You must version your code, during <b>Development</b>. Git is very popular version control software,
and it can be integrated with products that will actually store your code on a server.
These products help you manage your teams, branches, features, code, etc.

Another important aspect is that you are not
responsible for backing up your code. These products make sure that your code will be safe, and available only for you.

Treno supports the big version control softwares like:

* GitHub
* Bitbucket
* GitLab

Modern version control software integrates with Task management softwares, the write back information about the commits
for a release,
the status of the branch, the code quality, etc.

## CI/CD

When it comes to CI/CD, Jenkins comes to most people's mind.
This software revolutionized CI/CD, and still is a very popular choice.

Hosting a Jenkins server however is a different question. Many providers instead of Hosting Jenkins, hosts their own
abstract tool,
what can be integrated.

There are several tools out there and Treno can be integrated with Rollbar,
what can be integrated with common CI/CD tools like Jenkins.

CI/CD tools give you feedback about steps of the application (build, test, quality gates, deployment, documentation).
A good tool has stages where you can define and automate your own quality gates.

## Monitoring software

Having monitoring software with modern applications is a must.
THe purpose of monitoring is that we should be able to measure and interfere if needed.

Treno can integrate with any of the following monitoring software:

* Airbrake
* Sentry
* New Relic

You may ask, why do I need another orchestrator tool to do the monitoring and alerting?
The importance here is <b>measuring</b> at one place.
You need to create a report on how many SLA 1 incidents were in the last month...
surely you can do that in new relic, export the result, and embed it into Jira.

Or you could just create a report with Treno.
These tools are used mostly the <b>Operations and Monitoring</b> phase,
but constant feedback is required during testing and even development.
If you can measure the application response (for example HTTP requests),
you will be able to meet your <b>non functional requirements</b>

## Collaboration software

Communication is a key element between team members. Modern offices, and long distance projects require tools for
communication.
Microsoft Teams and Slack is a tool that helps you achieve this.

Treno integrates with slack, since a good collaboration software does not stop with video call,
tagging team members, or having a chat.
A good collaboration software can also notify you. For example, if there is a production issue, you get notified.
This is the extra what treno can give, if you, or your organization have another tool, just stick with it.

Collaboration software is used in all cycles, and the most important thing is to have one software in the org.
You will lose valuable information and time if you need to switch between several tools (like slack, teams, zoom),
just because somebody else likes to use a different tool.

# Conclusion

After understanding the SDLC, and what is the output of each cycle, it is clear that to measure and analyze productivity
you need to have a tool that collects information.
Treno.io offers such a tool, and more, it offers you a solution.

As stated in the article it will not magically solve your problem, but it will tell you where to improve.
The whole point of having SDLC is to improve and keep track.
