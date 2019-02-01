package daily.tools.abstract_template;

/**
 * @author 夸克
 * @date 2019/1/24 00:45
 */
public class AbstractProcessorTest {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void main(String[] args) {
        // TODO test
        TestContext testContext = new TestContext();
        contextHolder.set("aaa");
        TestProcessor testProcessor = new TestProcessor();
        // 调用process的编排
        testProcessor.process(testContext);

        TestContext exContext = new TestContext();
        // test bizHandle
        testProcessor.process(exContext);
    }

    private static class TestProcessor extends AbstractProcessor<TestContext> {
        @Override
        protected boolean preHandle(TestContext context) {
            // 前置的一个check或者一个前置操作
            String s = contextHolder.get();
            if (s == null) {
                throw new RuntimeException("holder中字符串为空");
            }

            context.setMessage(s);
            return true;
        }

        @Override
        protected void postHandle(TestContext context) {
            context.setPostStr("post");
            System.out.println("processor 结果是："+ context.isResult());
        }

        @Override
        protected void finallyHandle(TestContext context) {
            if (context.isResult()) {
                contextHolder.remove();
            }
        }

        @Override
        protected void bizHandle(TestContext context) {
            context.setResult(context.getMessage().length()>0);
        }
    }
}
