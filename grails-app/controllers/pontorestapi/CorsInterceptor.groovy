package pontorestapi

import org.springframework.http.HttpStatus


class CorsInterceptor {
    CorsInterceptor(){
        matchAll()
    }

    boolean before() {
        log.println("Entering action ${actionName} ${request.getRequestURL()} $request.getParameterValues()")
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods",
                "POST,GET,PUT,OPTIONS,DELETE");
        response.setHeader("Access-Control-Max-Age", Long.toString(60 * 61));
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
