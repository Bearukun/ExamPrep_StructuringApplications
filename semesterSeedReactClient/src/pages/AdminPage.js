import React, { Component } from 'react'
import {observer} from "mobx-react";
import adminStore from "../stores/adminStore";

const AdminPage = observer(
  class AdminPage extends Component {

    componentWillMount() {
      /*
      This will fetch data each time you navigate to this route
      Move to constructor, if only required once, or add "logic" to determine when data should be "refetched"
      */
        adminStore.getAll();
    }

    render() {

        var lis = adminStore.users.map((user)=>{
            return(
                <tr>
                    <td>{user.name}</td>
                    <td>{user.mail}</td>
                </tr>
            )
        })

        return (
        <div>
          <h2>Admins</h2>
          <p>This message is fetched from the server if you were properly logged in</p>
          <div className="msgFromServer">
          <table>
              <tr>
                <th>User</th>
                <th>Mail</th>
              </tr>
              {lis}
          </table>

          </div>
          <h4 style={{color: "red"}}>{adminStore.errorMessage}</h4>
        </div>
      )
    }

  }
)
export default AdminPage;