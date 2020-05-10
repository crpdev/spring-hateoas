# spring-hateoas
Develop a simple Spring HATEOAS Application

*H*ypermedia *A*s *T*he *E*ngine *O*f *A*pplication *S*tate

- The core idea behind Spring HATEOAS is to send Hypermedia information along with application data in the client responses.
- Where would this help?
    - Clients/ UI can be enhanced to provide additional information based on the responses received
        - For eg: When receiving a list of users as a response from a REST service, links will be helpful to provide more information about a specific resource.
    - When speaking about application states, links can control the flow of the application. This will enforce business logic to be defined in the server rather than the client/ UI.
        - For eg: In an Ordering system, Add To Cart service can reply with the Payment and Continue Shopping links, thereby enforcing application flow logic
    - Placing Hypermedia links along with application data will also help in the rapidly evolving business to handle new changes and improvements.
