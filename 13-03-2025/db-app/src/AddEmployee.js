import React, { useState} from "react";
import axios from "axios";

function AddEmployee() {

    const [emp, setEmp] = useState({
        id: "",
        name: "",
        age: "",
        salary: "",
        designation: ""
    });

    const assignData = (e) => {
        setEmp({...emp, [e.target.name]: e.target.value});
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(emp);
        axios.post("http://localhost:8080/employees", emp).then((response) => {
            console.log(response);
        });
    };

    const updateEmployee = () => {
        axios.post("http://localhost:8080/employees", emp).then((response) => {
            console.log(response);
        });
    };

    const deleteEmployee = () => {
        axios.delete("http://localhost:8080/employees", emp).then((response) => {
            console.log(response);
        });
    };



    return (
        <>
            <div className="add">
                <h2>Add Employee</h2>
                <form onSubmit={(e) => handleSubmit(e)}>
                    <label htmlFor="name">ID:</label>
                    <input type="text" id="id" onChange={assignData} name="id" value={emp.id} placeholder="Enter id.." required /><br></br>

                    <label htmlFor="name">Name:</label>
                    <input type="text" id="name" onChange={assignData} name="name" value={emp.name} placeholder="Enter name.."  required /><br></br>

                    <label htmlFor="age">Age:</label>
                    <input type="number" id="age" onChange={assignData} name="age" value={emp.age} placeholder="Enter age.."  required /><br></br>

                    <label htmlFor="salary">Salary:</label>
                    <input type="number" id="salary" onChange={assignData} name="salary" value={emp.salary} placeholder="Enter salary.."  required /><br></br>

                    <label htmlFor="designation">Designation:</label>
                    <input type="text" id="designation" onChange={assignData} name="designation" value={emp.designation} placeholder="Enter designation.."  required /><br></br>

                    <button type="submit">Add</button>
                    <button onClick={() => updateEmployee()}>Update</button>
                    <button onClick={() => deleteEmployee()}>Delete</button>
                </form>
            </div>
        </>
    );
}


export default AddEmployee;


