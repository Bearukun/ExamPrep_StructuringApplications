import React, { Component } from 'react'
import { observer } from "mobx-react";
import userStore from "../stores/userStore";

const UserPage = observer(
    class UserPage extends Component {

        componentWillMount() {
            /*
             This will fetch data each time you navigate to this route
             Move to constructor, if only required once, or add "logic" to determine when data should be "refetched"
             */
            userStore.getData();
        }

        render() {
            var lis = userStore.clubs.map((club)=>{
                    return(
                        <li>{club.name} <a href={club.url}/></li>
                        // <li>{club.name}, {club.url}></li>
                    )
                }
                // }

            )
            return (
                <div>
                    <h2>Users</h2>
                    <p>This message is fetched from the server if you are properly logged in</p>
                    <div className="msgFromServer">
                        {userStore.messageFromServer}
                        <ul>
                            {lis}
                        </ul>
                    </div>
                    <h4 style={{ color: "red" }}>{userStore.errorMessage}</h4>
                </div>
            )
        }

    }
)
export default UserPage;