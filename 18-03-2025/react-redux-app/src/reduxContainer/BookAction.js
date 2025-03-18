import { buy_book } from "./BookTypes";

const purchase_book = () => {
    console.log("Purchase book action created....");
    return{
        type: buy_book,
        payload: "I am buying book"
    }
}

const selling_book = () => {
    console.log("Sell book action created....");
    return{
        type: "sell_book",
        payload: "I am selling book"
    }
}

export { purchase_book, selling_book };