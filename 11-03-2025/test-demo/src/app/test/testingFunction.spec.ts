import { addition } from "./testingFunction"

describe("Calculation testing", () =>{

    it("Testing add function", () => {
        expect(addition(11, 22)).toBe(33);
    })

})

describe("String testing", () =>{
    
    it("Testing string equality using 'toBe'", () => {
        let str = "Hello World!";
        expect(str).toBe("Hello World!");
    });
    
    it("Testing string equality using 'toEqual'", () => {
        let str = "Hello World!";
        expect(str).toEqual("Hello World!");
    })

    it("Testing string equality using 'toMatch' (contains a digit)", () => {
        let str = "Hello World1";
        expect(str).toMatch(/\d+/);
    })
    
})


describe("Testing JSON object", () =>{

    it("Testing with deep checking", () => {
        let e1 = {"name" : "Raju", "age" : 25};
        expect(e1).toEqual({"name" : "Raju", "age" : 25});
    });

    it("Testing array", () => {
        let arr = [11, 22, 33 ,44 ,55];
        expect(arr).toEqual([11, 22, 33 ,44 ,55]);
    });

})
