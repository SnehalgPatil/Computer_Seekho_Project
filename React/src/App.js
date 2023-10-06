import logo from './logo.svg';
import './App.css';
import Header from './Header';
import Home from './Home/Home';
import { Outlet } from 'react-router-dom';
import Footer from './Footer';

function App() {
  return (
    <div className="app-container">
      <Header />
      <div style={{margin:"5%"}}>
        <Outlet />
      </div>
      <br/>
      <Footer />
    </div>
  );
}

export default App;
