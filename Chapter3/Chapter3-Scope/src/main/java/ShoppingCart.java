import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by Chohee on 8/28/16.
 */


@Component
@Scope(value= WebApplicationContext.SCOPE_SESSION,
        proxyMode = ScopedProxyMode.INTERFACES)
public interface ShoppingCart {
}
