import React, { useEffect, useState } from "react";
import axios from "axios";

function ViewStudent() {
  const [students, setStudents] = useState([]);
  useEffect(() => {
    fetchStudent();
  }, []);
  const fetchStudent = async () => {
    const baseURL = "http://localhost:8080/getStudents";
    const response = await axios.get(baseURL);
    setStudents(response.data);
  };
  return (
    <>
      <h1>This is view student </h1>

      <table>
        <thead>
          <tr>
            <th>id</th>
            <th>name</th>
            <th>age</th>
            <th>department</th>
          </tr>
        </thead>

        <tbody>
        {students.map((student)=>(
            <tr>
            <th>{student.id}</th>
            <th>{student.name}</th>
            <th>{student.age}</th>
            <th>{student.dept}</th>

            </tr>

        ))}
            
        
        </tbody>
      </table>
    </>
  );
}
export default ViewStudent;
