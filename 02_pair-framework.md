# Pair Programming Framework

Instead of describing pair programming in the traditional driver and navigator roles, I've chosen to
describe it with the architect and engineer roles.

My motivation for doing so is that it actually mirrors what the design and implementation flow is
like in industry. One of the weirdest jumps to make from being a CS students to being a SWE was that
no one explicitly told me what to do. It's common in CS classes to be told to create something that
meets very specific criteria. Many CS assignments begin with some variation of:

- "using a **for** loop..."
- "write a **conditional** that..."
- "create a **function** that takes the **parameters**..."

However, in industry, which is the career path that many students aim for, the prompts are a lot
less structured. Usually the prompts are just well-defined goals and they leave implementation
details the programmer. An example prompt I've seen at work was along the lines of:

- "For the input `x`, function `foo` produces duplicate values which is unwanted behavior. To
fix this issue and remove duplicates, make sure that the underlying data structure `A` cross-checks
new fields against existing ones."

## Questions

0. This pair programming model is split into two roles: architect and engineer. Since the titles
"architect" and "engineer" are pretty common across careers, it's easy to gear this analogy to
student interests. I will personally refer to an "architect" as a building architect, someone in
construction who designs and plans houses. The architest plans the project and ultimately draws a
blueprint for the engineer to follow. In this analogy, the engineer would be a civil engineer. The
civil engineer's job is to execute on the plan that the building architect gave them. Since
construction is an extremely collaborative project, both parties stay in constant contact with each
other since it's common for each party to have questions, suggestions, and concerns about the other's
responsibility.

1. I think this analogy is very approachable since most students have some general sense of what an
architect and engineer do individually, but maybe haven't paired the mental ideas together yet. 

2. Since the roles of pair programming in this analogy are career paths, I think student buy-in will
be good because it makes them feel like they have actual jobs. One of my personal worries as a CS student,
was that I never moved away from "school code" and I didn't know what "professional code" looked like.
This framework helps to break down that barrier, enabling students to get a taste of what it's like
to work in the CS industry, exciting them to continue and further invest in the analogy.

3. This framework is particularly strong in supporting the fact that the architect shouldn't be doing
the engineer's job and vice versa. The roles are very clearly defined and each party is made to feel
like a critical role at play. One of the pitfalls of other frameworks is that the non-driver often
feels like a sidekick to the driver. For the driver analogy, most drivers can navigate on their own.
The rally cross framework fixes this issues by upping the intensity of driving, but generally,
navigating on your own isn't a big issue.

4. I think this framework is naturally weak in supporting the engineer's thinking. For example, as
the engineer, and also in most frameworks, it's easy to fall into the trap that the architect does
all of the thinking. However, this can be fixed when talking to students and highlighting the fact
that it's necessary that the engineer contributes just as much as the architect. Since the engineer
has direct access to the code, implementation choices can save time for future iterations of the project.
