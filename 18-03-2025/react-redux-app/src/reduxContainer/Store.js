import { createStoreHook } from "react-redux";
import { BookReducer } from "./BookReducers";
import { createStore } from "redux";

// const store = createStoreHook(BookReducer);
const store = createStore(BookReducer);

export { store };