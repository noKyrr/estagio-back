package pontorestapi

import org.springframework.http.HttpStatus


class CorsInterceptor {
    CorsInterceptor(){
        matchAll()
    }

    boolean before() {
        log.println("Entering action ${actionName} ${request.getRequestURL()} $request.getParameterValues()")
       /* header( "Access-Control-Allow-Origin", "http://localhost:8081" )
        header( "Access-Control-Allow-Credentials", "true" )
        header( "Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE" )
        header("Access-Control-Allow-Headers", "content-type")
        //header( "Access-Control-Max-Age", "3600" )
*/


        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8081");
        response.setHeader("Access-Control-Allow-Methods",
                "POST,GET,PUT,OPTIONS,DELETE");
        response.setHeader("Access-Control-Max-Age", Long.toString(60 * 60));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader(
                "Access-Control-Allow-Headers",
                "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");

        true  }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
