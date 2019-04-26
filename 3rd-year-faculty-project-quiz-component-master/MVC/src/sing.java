public class sing {
    private static sing k = new sing () ;

    private sing() {}
    public static sing  getinnst ()
    {
        if(k == null)
        {
            k = new sing() ;
            return  k ;
        }
        return  k ;
    }
}
