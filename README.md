# eej-hateoas
Library to give an automatic way of publishing Objects on services matching HATEOAS mode.

Actually, I have been giving a try and reading documentation, tutorials and api docs from spring-hateoas, and I was not convinced at all by the solution they found. 

So this is my effort to find a more automatic way of converting a non-hateoas @ResposeBody entity to a Hateoas compliant response, just by making the returning model bean anotated with a custom annotation @HateoasEntity.

Thus, it is still necessary to generate the links. My plan is to try to generate them by looking for methods whose retunrning types match the each bean which is part of the return. I will try to achieve it by creating another annotation @HateoasRestController which will need to be included in each controller wanted to return Hateoas compliant objects.
