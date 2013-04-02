package ma.moov.core;

import java.util.ArrayList;
import java.util.List;

import ma.moov.core.domaine.Adress;
import ma.moov.core.domaine.User;
import ma.moov.core.domaine.dao.UserRepository;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx = new GenericXmlApplicationContext("META-INF/spring/mongo-context.xml",
        		"META-INF/spring/dao-context.xml");
        
        UserRepository repo = (UserRepository)ctx.getBean("userRepository");
        User u = new User();
        u.setLogin("my test toto");
        u.setPhone("0989456423");
        u.setEmail("email@moov.ma");
        Adress a = new Adress();
        a.setNum("num");
        a.setVille("tetouan");
        Adress b = new Adress();
        b.setNum("35");
        b.setVille("tanger");
        repo.insertAdress(a);
        repo.insertAdress(b);
        List<Adress> adresses = new ArrayList<Adress>(); //Collections.
        adresses.add(a);
        adresses.add(b);
        u.setAdresses(adresses);
        repo.insertContact(u);
        
    }
}
