package users.get;

import com.intuit.karate.junit5.Karate;

public class UserGetRunner {

    @Karate.Test
    Karate userGet() {
        /*Ejecucion de la carpeta users*/
        return Karate.run("classpath:users").relativeTo(getClass());
        /*Ejecucion de un feature desde la carpeta actual*/
        //return Karate.run("../put/user-put.feature").relativeTo(getClass());
        /*Ejecucion de un feature desde la carpeta actual*/
        //return Karate.run().relativeTo(getClass());
    }

}