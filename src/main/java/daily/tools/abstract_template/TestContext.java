package daily.tools.abstract_template;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author 夸克
 * @date 2019/2/1 15:41
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode
public class TestContext {
    private String preStr;

    private String postStr;

    private boolean result;

}
