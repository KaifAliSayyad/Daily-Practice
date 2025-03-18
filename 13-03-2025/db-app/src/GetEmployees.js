import axios from "axios";
import { useState, useEffect} from "react";

function GetEmployees() {
    const [employees, setEmployees] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:8080/employees").then((response) => {
            setEmployees(response.data);
        });
    }, []);
 
    return(
        <>
            <div className="show">
                <h2>Employees List</h2>
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Age</th>
                            <th>Salary</th>
                            <th>Designation</th>
                        </tr>
                    </thead>
                    <tbody>
                        {employees.map((employee) => (
                            <tr key={employee.id}>
                                <td>{employee.id}</td>
                                <td>{employee.name}</td>
                                <td>{employee.age}</td>
                                <td>{employee.salary}</td>
                                <td>{employee.designation}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    );
}

export default GetEmployees;
