package cn.trasen.chengying.entity.pagedesigner;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author rq
 */

@Data
public class InputUpdateEvents {
    @NotNull(message = "id不能为空")
    @Size(min = 1, max = 150, message = "id长度范围是1-150个字符")
    private String id;

    private UpdateEvents object;
}
