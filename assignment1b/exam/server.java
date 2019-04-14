import java.rmi.registry.Registry;

import java.rmi.*;
class server extends impl{
    
    inf obj = new impl();
    Naming.bind("asdf",inf);

}