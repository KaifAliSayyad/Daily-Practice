import { Calculator } from "../calculator"

describe("Class Calculator testing", () =>{

    let calc: Calculator;
    beforeEach(() =>{
        calc = new Calculator();
    })

    it("Addition testing", () =>{
        let res = calc.add(22, 33);
        expect(res).toBe(55);
    })
    it("Substraction testing", () =>{
        let res = calc.sub(33, 22);
        expect(res).toBe(11);
    })
    it("Multiplication testing", () =>{
        let res = calc.mul(2, 3);
        expect(res).toBe(6);
    })
    it("Division testing", () =>{
        let res = calc.div(6, 3);
        expect(res).toBe(2);
    })
    it("Modulus testing", () =>{
        let res = calc.mod(6, 3);
        expect(res).toBe(0);
    })
})