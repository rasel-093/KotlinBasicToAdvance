//A sealed modifier used in front of a class behaves just like abstract,
// but it also introduces some limitations.
//Officially subclasses of a sealed class need to be defined in the same package.
// What is more important is that a sealed modifier is information to the developer who reads the code -
// it informs them that this class has a limited number of subclasses known in advance during compilation.

// sealed class Result
//class Success(val data: String) : Result()
//class Failure(val exception: Throwable) : Result()