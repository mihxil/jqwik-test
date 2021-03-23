import net.jqwik.api.ForAll;
import net.jqwik.api.Property;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Michiel Meeuwissen
 */

interface BTheory<E extends B> extends ATheory<E>  {

	@Property
	default void testA(@ForAll("elements") E a) {
		assertThat(a.toString()).isEqualTo("b");
	}

}
