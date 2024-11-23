import React, { useEffect, useState } from "react"; 

const RecordsIndex = (props) => {
  const [recordState, setRecords] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/records/get/1")
      .then((response) => {
        if (!response.ok) {
          throw new Error(`Network response was not ok: ${response.status}`);
        }
        return response.json();
      })
      .then((data) => {
        setRecords([data]); // Nastavení dat do stavu
      })
      .catch((error) => {
        console.log("Error", error);
      });
  }, []);

  return (
    <div>
      <h1>Tracklet</h1>
      <ul>
        {/* Předpokládáme, že data obsahují objekty s těmito klíči */}
        {recordState.map((record) => (
          <li key={record.name}>
            <strong>{record.name}</strong><br />
            Value: {record.value} {record.currency}<br />
            Date: {new Date(record.dateTime).toLocaleString()}<br />
            Note: {record.note}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default RecordsIndex;

