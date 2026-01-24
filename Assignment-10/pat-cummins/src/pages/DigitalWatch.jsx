import { useEffect, useState } from "react";

const DigitalWatch = () => {
  const [time, setTime] = useState(new Date().toLocaleTimeString());

  useEffect(() => {
    const id = setInterval(() => {
      setTime(new Date().toLocaleTimeString());
    }, 1000);

    return () => clearInterval(id);
  }, []);

  return (
    <div>
      <h2>Digital Watch</h2>
      <h3>{time}</h3>
    </div>
  );
};

export default DigitalWatch;
