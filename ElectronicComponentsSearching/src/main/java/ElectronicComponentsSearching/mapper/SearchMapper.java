package ElectronicComponentsSearching.mapper;

import ElectronicComponentsSearching.domain.SearchingContent;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface SearchMapper{
    
    List<SearchingContent> getSearchContent(@Param("searchingContent")String searchingContent);
    
}
