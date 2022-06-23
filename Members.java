public interface Members {


    abstract void canOrganise();
    abstract void canWatch();
}
class GeneralMembers implements Members
{
    public void canWatch()
    {
        System.out.println("General Member Can watch only");
    }

    public void canOrganise()
    {
        System.out.println("General Member Cannot organise");
    }
}

class VipMembers implements Members
{
    public void canOrganise()
    {
        System.out.println("Vip Member Can Organise");
    }

    public void canWatch()
    {
        System.out.println("Vip Member Can Watch");
    }
}

class PrimeMembers implements Members
{
    public void canOrganise()
    {
        System.out.println("Prime Member Can Organise");
    }

    public void canWatch()
    {
        System.out.println("Prime Member Can Watch");
    }
}

class MainClass
{
    public static void main(String args[])
    {
        Members gm = new GeneralMembers();
        Members vm = new VipMembers();
        Members pm = new PrimeMembers();
        gm.canOrganise();
        gm.canWatch();
        System.out.println();
        vm.canOrganise();
        vm.canWatch();
        System.out.println();
        pm.canOrganise();
        pm.canWatch();
    }
}

