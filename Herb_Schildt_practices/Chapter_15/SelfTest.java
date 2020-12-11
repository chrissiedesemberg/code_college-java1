package Chapter_15;

public class SelfTest {

//            1. In general terms, modules give you a way to specify when one unit of
//            code depends on another. True or False?
//                    --> True
//            2. A module is declared using what keyword?
//                    --> module
//            3. The keywords that support modules are context sensitive. Explain what
//            this means.
//                    --> That means that the keywords work inside modules, but it can be also be
//                    used as variables/parameters etc. It wont be blocked by java. It is
//                    still not advisable though.
//            4. What is moduleinfo.java and why is it important?
//                    --> The file where the module declaration & definition is held in.
//                          Generally it specifies one or more clauses that define the characteristics of the module.
//            5. To declare that one module depends on another module, what keyword do
//            you use?
//                    --> requires
//            6. To make the public members of a package accessible outside the module
//            in which it is contained, it must be specified in an >-- export --< statement.
//            7. When compiling or running a modulebased application, why is the module
//            path important?
//                    --> A module path tells the compiler where the compiled files will be located.
//            8. What does requires transitive do?
//                    --> In example, if you have three files, Rain that depends on clouds, and then clouds that depend on condensation.
//                          Your modules would look like:
    /*
                        module rain {
                            requires clouds; }

                        module cloud {
                            requires condensation;}

                        This would work as long as rain does not need to use a type in condensation directly.
                        If you changed the module cloud to --> requires transitive condensation; then rain would get access
                        when it needs it
*/
//
//            9. Does an exports statement export another module, or does it export a
//            package?
//                      --> It exports a package
//            10. In the first module example, if you remove from the appfuncs
//            moduleinfo file and then attempt to compile the program, what error do
//            you see?
//                    --> It would give a compiler error that SimpleMathFuncs package does not exist
            //  and it wont compile
//            11. Modulebased services are supported by what keywords?
    //              -->provides; uses, and with.
//            12. A service specifies the general form of a unit of program
//            functionality using either an interface or abstract class. True or False?
//                  --> True
//            13. A service provider --> implements <--  a service.
//            14. To load a service, what class do you use?
//                     --> ServiceLoader
//            15. Can a module dependency be made optional at run time? If so, how?
//                     --> Yes - by using exports static statement
//            16. Briefly describe what open and opens do.
//                      -->  Open: enable runtime access to all packages in the module,
//                      whether a package is exported or not. To allow this, you can create an open module
//                        --> opens:It is possible for a module to open a specific
//                        package for runtime access by other modules and for reflective
//                        access rather than opening an entire module. To do so, use
//                          the opens statement,


}
