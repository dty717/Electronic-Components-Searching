package ElectronicComponentsSearching.web; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.google.gson.Gson;
import ElectronicComponentsSearching.service.SearchService;

@Controller
public class SearchController {
    
    @Autowired
    SearchService searchService;
    @Autowired
    Gson gson;    
    
    @RequestMapping(value = { "getSearchContent"},produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getSearchContent(@RequestParam(name="searchingContent",required=false)String searchingContent) {
        return gson.toJson(searchService.getSearchContent(searchingContent));
    }
    
}
