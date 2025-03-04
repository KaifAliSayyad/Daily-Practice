var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Emp = /** @class */ (function () {
    function Emp(name, age) {
        this.name = name;
        this.age = age;
    }
    Emp.prototype.display = function () {
        console.log("Name : " + this.name);
        console.log("Age  : " + this.age);
    };
    return Emp;
}());
var Clerk = /** @class */ (function (_super) {
    __extends(Clerk, _super);
    function Clerk(name, age, salary, designation) {
        var _this = _super.call(this, name, age) || this;
        _this.salary = salary;
        _this.designation = designation;
        return _this;
    }
    Clerk.prototype.displayAll = function () {
        this.display();
        console.log("Salary	: " + this.salary);
        console.log("Designation: " + this.designation);
    };
    return Clerk;
}(Emp));
var c1 = new Clerk("Raju", 25, 25000, "TESTER");
c1.displayAll();
console.log("-------------------------------------------------------------------");
var Hatchback = /** @class */ (function () {
    function Hatchback() {
        this.speed = 0;
    }
    Hatchback.prototype.accelerate = function () {
        console.log("Accelerator : " + ++this.speed);
    };
    Hatchback.prototype.brake = function () {
        console.log("Brake : " + --this.speed);
    };
    return Hatchback;
}());
var h1 = new Hatchback();
h1.accelerate();
h1.accelerate();
h1.accelerate();
h1.brake();
var m1 = { "company": "Maruti", "model": "Brezza", "price": 1825000, "gear": true };
var t1 = { "company": "Tata", "model": "Nexon", "price": 202500 };
var m2 = { "company": "Maruti", "model": "M&M", "price": 1825000 };
console.log(m1);
console.log(t1);
console.log(m2);
console.log("-------------------------------------------------------------------");
var arr1 = ["Hi", "Hello", "How are you", "Thanks", "Bye"];
var arr2 = ["Hi", "Hello", "How are you", "Thanks", "Bye"];
arr1.push("Just for Demo");
console.log(arr1);
console.log(arr2);
