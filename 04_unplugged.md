# CS Unplugged Activity Plan
#### by A to Z
Roster: Andy Mina, Warren Zeng

# BIG IDEA: Traversing a Graph
# NAME OF THE GAME: Find the target!
## BRIEF DESCRIPTION:   
Students will act as the "nodes" in a graph. The objective will be to find a target person, requiring students to "traverse" through the graph. 

## Background

Students will act as nodes in an undirected graph. The class will have to traverse the nodes in a graph to find a path that leads to the target node, if it exists. 

Traversing graphs and finding a path from one node to a target node is a very common problem in programming. Graph problems have many real-world examples like routing utilities for houses, planning quickest routes for road trip, or even see the friendship relation of social media users.

(If you want, you can frame the activity in the lens of friendship relations.)

## Participant pre-requisites
Students should understand how references work (one node points to one other node). In this activity, each node can ONLY point to one other node.

## Scaffolding / Differentiation
Review concept of linked lists, references, and nodes

### Opportunities for Differentiation
 - Creating a cyclic graph
 - Creating a graph with unreachable nodes
 - Increasing the number of links one node can have

## Materials
1. Pieces of paper with each student's name on it
2. A piece of paper to be used as the "target" (marked with an X, "target" written on paper, etc.)


### Activity Plan
1. Distribute papers with names to each student, except for 1 student who will be the target and recieve the "target" paper instead. 
2. Instruct students that they are not allowed to look at other people's papers.
3. Students will collectively decide which node to start from. 
4. After selecting a starting node (that isn't the target), that node will briefly reveal their paper to the class, showing whose name they have on it. The node whose name was on this paper reveals their own paper moving on to the next person
5. This cycle continues until we find the target. If the target is found, they reveal their target paper (marked with an X). 
6. If the entire path is traversed and doesn't reach the target, have students select a new starting node and repeat from step 3.


### Related resources
* Check out [six degrees of separation](https://en.wikipedia.org/wiki/Six_degrees_of_separation) for real life example of traversing a graph with people.
* Example social network graph ![social network graph](https://i.stack.imgur.com/rzkm6.png)
* Housing utility graph example and explanation [here](https://en.wikipedia.org/wiki/Three_utilities_problem) ![housing utility graph](https://hips.hearstapps.com/hmg-prod/images/pmx030121coldeepmath-002-1614612780.jpg)

### class demo 1
- Warren (target)
- Andy -> Luis
- Emile -> Warren
- Luis -> JonAlf
- JonAlf -> Andy

### class demo 2
- Luis (target)
- Andy -> Emile
- Emile -> JonAlf
- JonAlf -> Andy
- Warren -> Luis

### class demo 3 (differentiation)
- JonAlf -> (target)
- Andy -> Warren
- Emile -> Luis
- Luis -> Andy
- Warren -> Andy
