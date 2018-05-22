package common.test.spring.serviceimpl;
import common.test.spring.model.RedisModel;
import common.test.spring.service.IRedisService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/1 16:00.
 */
@Service
public class RedisServiceImpl extends IRedisService<RedisModel> {
    private static final String REDIS_KEY = "TEST_REDIS_KEY";

    @Override
    protected String getRedisKey() {
        return this.REDIS_KEY;
    }
}
