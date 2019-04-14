import java.rmi.registry.LocateRegistry;

class client
{
    Registry r = LocateRegistry.getRegistry();
    impl a = (impl)Naming.lookup("asdf");
    //System.out.println(a.check("asdf","sdf"));
}