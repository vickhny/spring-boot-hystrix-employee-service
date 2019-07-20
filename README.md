# spring-boot-hystrix-employee-service
This example demonstrates how to to leverage the one of the Spring cloud Netflix stack component called Hystrix to implement circuit breaker while invoking underlying microservice. It is generally required to enable fault tolerance in the application where some underlying service is down/throwing error permanently, we need to fall back to different path of program execution automatically. This is related to distributed computing style of Eco system using lots of underlying Microservices. This is where circuit breaker pattern helps and Hystrix is an tool to build this circuit breaker.

# Why is Circuit Breaker Pattern?
If we design our systems on microservice based architecture, we will generally develop many Microservices and those will interact with each other heavily in achieving certain business goals. Now, all of us can assume that this will give expected result if all the services are up and running and response time of each service is satisfactory.

Now what will happen if any service, of the current Eco system, has some issue and stopped servicing the requests. It will result in timeouts/exception and the whole Eco system will get unstable due to this single point of failure.

Here circuit breaker pattern comes handy and it redirects traffic to a fall back path once it sees any such scenario. Also it monitors the defective service closely and restore the traffic once the service came back to normalcy.

So circuit breaker is a kind of a wrapper of the method which is doing the service call and it monitors the service health and once it gets some issue, the circuit breaker trips and all further calls goto the circuit breaker fall back and finally restores automatically once the service came back !! That’s cool right?

# Hystrix Circuit Breaker Example
To demo circuit breaker, we will create following two microservices where first is dependent on another.

Employee Microservice – Which will give some basic functionality on Employee entity. It will be a REST based service. We will call this service from Department Service to understand Circuit Breaker. It will run on port 8098 in localhost.

Department Microservice – Again a simple REST based microservice where we will implement circuit breaker using Hystrix. Employee Service will be invoked from here and we will test the fall back path once student service will be unavailable. It will run on port 9098 in localhost.

# Tech Stack and Demo Runtime
Java 1.8
STS as IDE
Gradle as build tool
Spring cloud Hystrix as circuit breaker framework
Spring boot
Spring Rest
