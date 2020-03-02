# PIZZA FACTORY KATA

## GOALS
The goals of this kata is for the team members to be able to work together with git.
They should be able to add in parallel some code and be able to merge/rebase it effectively.
This kata is a simple way to do it.

## KATA SUBJECT
The owner of the Bro Pizza Factory, Mario and Luigi, asked your team to make a pizza factory.
They provided you a list of toppings:
- Cheeses          : Mozzarella, Ricotta, Feta, Parmesan, Cheddar, Monterey
- Vegetables       : carrot, tomatoes, mushrooms, onions, olives, beans, peppers, spinach
- Nuts             : almonds, peanuts, pistachios, pine nuts, walnuts
- Herbs and Spices : basil, coriander, garlic, oregano, pepper, rosemary
- Sea Food         : anchovies, lobster, shrimps, salmon, squid, tuna, oysters
- Meats            : bacon, ham, salami, meatballs, duck, chicken, barbecued meat

With this toppings each developer will create a pizza named like this: <developer_firstname developer_lastname> and
add it to the menu.
Your goal is to make sure that you delivered pizza with fresh toppings.
If one pizza in an order is not fresh, the order is not delivered. Quality first!

## Here are the objectives of the kata:
1- Your first goal as developer is to push your pizza in the remote server on the branch where the code is taken for
going live. You have to respect the branching management used by your team/company.
**The first one** to push his pizza has to be the facilitator.
Objective: you have to be able to merge your code by resolving one or more conflicts.

2- The Bro Pizza Factory is a world success. The pizza is known in Milan, Paris, Lisbon, New-York, Chennai.
As a developer, you want to have your own pizza factory. To do so, you create a branch named
<developer_firstname_developer_lastname>'s pizza based on the previous branch master.
Everything works fine and your pizza factory is doing pretty good.
But at one moment you have to change of supplier. To do so, on your own branch, you have execute the following git command:
__git cherry-pick <hash-supplier-change>__
And now it's terrible. Your pizza seems to be intoxicated and you stop completely the delivering instead of having not satisfied customers.
You have to analyse your toppings list to find what's wrong and fix quickly the problems before loosing all of
your customer.
Objective: you have to create a hotfix and make it live quickly.
N.B.: the branch you created for your pizza factory has to considered as your production base code.
