import { useDispatch, useSelector } from "react-redux";
import { purchase_book, selling_book } from "../reduxContainer/BookAction"


export default function BookContainer() {
    const noOfBooks = useSelector(state => state.NumberOfBooks)
    const dispatch = useDispatch();

    return (
        <div>
            <h2>This is from Book Container</h2>
            <h3>Number of books - {noOfBooks}</h3>
            <button onClick={() => dispatch(purchase_book())}>Purchase Book</button>
            <button onClick={() => dispatch(selling_book())}>Sell Book</button>
        </div>
    )
}

