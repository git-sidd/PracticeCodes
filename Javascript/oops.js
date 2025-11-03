//TODO Class && Objects in js

class person{
    constructor(name,age){
        this.name=name;
        this.age=age;
    }

    greet(){
        console.log(`Hello ${this.name} your age is ${this.age}`);
    }
}
//const p1=new person("Siddhesh",21);
// p1.greet()


//TODO  Inheritance + Polymorphism

class teacher extends person{
    constructor(name,age,role){
        super(name,age);
        this.role=role;
    }
    greet(){
        console.log(`I am ${this.role} and my name is ${this.name}`)
    }
}


// const p2=new teacher("Siddhesh",21,"HOD");
// p2.greet();

//TODO: Encapsulation + Abstraction
//Encapsulation
//Wapping up the data members and member function in a single unit is called Encapsulation 
//getters and setters are used to access the private variables


//Abstraction:user can only interact with get and set methods but not with the internal balance calculation

class encapsulate{
    #balance=0;
    constructor(balance){
        this.#balance=balance;
    }
    get(){
        console.log(`Balance is ${this.#balance}`);
    }
    set(new_balance){
        this.#balance=this.#balance+new_balance;
        console.log(`Updated balance is ${this.#balance}`)
    }
}
const p3=new encapsulate(45);
p3.get();
p3.set(45);
p3.set(100);
console.log(p3.balance)

