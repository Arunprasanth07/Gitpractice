// BASIC Variable & BASIC Actions



// To print a varible ("//" - to write single line of comment
console.log("Star platinum_The World")
/* this is used
to write
multiple line comments */
// to declare a variable a - variable | 77 - value stored in the variable
let a = 77
let b = 23
let c = a+b
let d = a*b
let e = c - d 
console.log(e)
// to performing a function by declaring the property to the variable - C
console.log(typeof(e))
// to find the data type of the variable type of() is used
let f = "Mastermind"
let peace = true
console.log(typeof(peace))
console.log(typeof(f))
// ! is used for not = equals to != not equals
console.log(!peace)
/*
Let - can be resassigned but can't redeclare
const - can't reassign or re declare
var - can be re declared for different variable */
const man = "Human"
// var man = "not human" - can reassign or redeclare
// If else condition
const time = true
if (!time)
{
console.log("Can't buy again")
}
else
{
    console.log("It's a dream")
}
// while condition
let x = 0
while (x=0)
{
console.log(x)
}
// Incremantal while condition
let i = 0
while (i<25)
{
i++
console.log(i)
}
// do while loop

do
{
i++
}while(i>10);
console.log(i)
// For loop
for(let m= 0; m<16 ;m++)
  {
      console.log(m)
}
// If condition in the for loop

for(letn= 0; n<16 ;n++)
    {
        (n%2==0 && n%3==0) // && - is used to satisfy the both condition || - is used to compare the condition seperately
        console.log(m)
    }
    // ARRAYS
    var months = ["may","june","july","April","march"]
    console.log(months[1]) // To print the 1st index in the array usually array starts with 0,1,2,3,4
    console.log(months.length)
    months.push("August") // To increase the size of the array by adding value to the new last index
    console.log(months)
    months.pop() // To reduce the size of the array by deleting the last index
    months.unshift(0) // To increase the size of the array by adding value to the new first index
    console.log(months)
   console.log( months.includes(20)) // Used to verify the element is present in array or not.
   let secondhalf = months.slice(3,6) // to create new array from spliting the old array with existing data
   console.log(secondhalf)
   // For loop in array
   var months = ["may","june","july","April","march"]
months.push(22)
    for (i=0;i<months.length;i++) // looping method for array to return the data in array
    {
        console.log(months[i])
    }
// to sum up the total value for array
var price = [222,456,789,123,12,45,987]
price.push(22)
sum = 0
    for (i=0;i<price.length;i++) // looping method for adding the elements in array to return total value
    {

        console.log(price[i])
        sum = sum + price[i]
    }
console.log(sum)
// Reduce menthod in Array

var price = [222,456,789,123,12,45,987]
let total = price.reduce((sum,price)=> sum+price,0) // Used to simplify the looping add method and get the total data in 2 line for code
console.log(total)
// using for loop to filter the data by condition
var price = [222,456,789,123,12,45,987,22]
var oddno = []
for(let n= 0; n<price.length ;n++)
    {
      if (price[n]%2==0 && price[n]%3==0) // && - is used to satisfy the both condition || - is used to compare the condition seperately
      {
      oddno.push(price[n])
    }
}
    console.log(oddno)
    // Filter method in array
    var price = [222,456,789,123,12,45,987,22]
    let filterodd = price.filter(price=>price%2==0) //Used to simplify the looping filter method and get the total data in 2 line for code
    console.log(filterodd)
    // Map funtion or method in array
    var price = [222,456,789,123,12,45,987,22]
    let filtercube = price.map(price=>price*3)// Used to perform the multiplying the elements in the Array 
    console.log(filtercube)
    // Sorting in Array (String sorting and sorting the numbers) bubble sorting method
    let type = ['dype7','rype2','eype1','aype9']
    type.sort()
    console.log(type)
    console.log(type.reverse()) // this is used to revese the sort order for current order
// number sorting method
let counter = [3,5,9,2,7,1]
   console.log(counter.sort((a,b)=>a-b))
   // Functions in JS
   function add (a,b,c,d,e)
   {
     return a+b+c+d+e        // Used to store a opration under the function name a call any where in the code to execute
   }

   let sumoffive = (a,b,c,d,e)=> (a+b+c+d+e) // simplified method for function

   let totol = add (22,46,88,12,100)
   console.log(totol)

// Strings in JS
let jojo = "Star platinum_The World"
console.log(jojo.length)
let stand = jojo.slice(0,13) // Uses to trim the string a declare as a new variable
console.log(stand)
// Split method in string 
let standname = jojo.split("_") // Uses to split the string and stored in new array as a new variable
console.log(standname[0])
console.log(standname[0].length)
// Int to string method
let my = "1"

let your = "99"
console.log(parseInt(me)+parseInt(you)) 
// string to int method
let me = "1"

let you = "99"
me.toString()
you.toString()
let us = me + you
console.log(us)
 // Concatinate a new data with old data from array
 let newstand = standname[0] + "& gold experience"
 console.log(newstand)
 // To find the occurance of string in the array
 let counte = 0
 let value = newstand.indexOf("e")
 while(value !== - 1)
{
counte++
value = newstand.indexOf("e",value+1)
}

 console.log(counte)

 // Objects in JS
 let IT_guy = {

   name: 'Arun',
   id: 1,
   Team: 'London',
   position: 'Manager'
 }

console.log(IT_guy.id)
IT_guy.name = "Arun prasanth"
console.log(IT_guy.name)